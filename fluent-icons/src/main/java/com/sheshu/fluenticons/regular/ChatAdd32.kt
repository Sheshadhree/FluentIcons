package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatAdd32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatAdd32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(0f, -7f)
            curveTo(8.268f, 2f, 2f, 8.268f, 2f, 16f)
            curveToRelative(0f, 2.37f, 0.59f, 4.605f, 1.63f, 6.563f)
            lineTo(2.06f, 28.09f)
            curveToRelative(-0.321f, 1.13f, 0.723f, 2.175f, 1.853f, 1.853f)
            lineToRelative(5.528f, -1.572f)
            curveTo(11.398f, 29.411f, 13.632f, 30f, 16f, 30f)
            curveToRelative(7.732f, 0f, 14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            close()
            moveTo(4f, 16f)
            curveTo(4f, 9.373f, 9.373f, 4f, 16f, 4f)
            curveToRelative(6.628f, 0f, 12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.372f, 12f, -12f, 12f)
            curveToRelative(-2.164f, 0f, -4.19f, -0.572f, -5.942f, -1.572f)
            curveToRelative(-0.233f, -0.133f, -0.51f, -0.167f, -0.769f, -0.093f)
            lineToRelative(-5.06f, 1.439f)
            lineToRelative(1.438f, -5.06f)
            curveToRelative(0.074f, -0.258f, 0.04f, -0.536f, -0.094f, -0.77f)
            curveTo(4.573f, 20.194f, 4f, 18.165f, 4f, 16f)
            close()
        }
    }.build()
}
