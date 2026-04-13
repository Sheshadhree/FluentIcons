package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneChat20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneChat20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(5.672f, 2f, 5f, 2.672f, 5f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(5f, 17.328f, 5.672f, 18f, 6.5f, 18f)
            horizontalLineToRelative(2.617f)
            lineToRelative(0.373f, -1.227f)
            curveTo(9.175f, 16.08f, 9f, 15.31f, 9f, 14.5f)
            curveTo(9f, 11.462f, 11.462f, 9f, 14.5f, 9f)
            curveToRelative(0.168f, 0f, 0.335f, 0.008f, 0.5f, 0.022f)
            verticalLineTo(3.5f)
            curveTo(15f, 2.672f, 14.328f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(8f, 17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(16.985f, 10f, 14.5f, 10f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            curveToRelative(0f, 0.792f, 0.204f, 1.536f, 0.563f, 2.182f)
            lineToRelative(-0.544f, 1.789f)
            curveToRelative(-0.095f, 0.313f, 0.197f, 0.605f, 0.51f, 0.51f)
            lineToRelative(1.79f, -0.544f)
            curveTo(12.965f, 18.796f, 13.709f, 19f, 14.5f, 19f)
            close()
            moveTo(12f, 13.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.776f, 14f, 16.5f, 14f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
            moveToRelative(0.5f, 2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 16f, 14.5f, 16f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
