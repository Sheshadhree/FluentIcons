package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Crop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Crop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(7f, 2.448f, 7f, 3f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 7.448f, 2f, 8f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineTo(23f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(11.5f)
            curveTo(10.12f, 23f, 9f, 21.88f, 9f, 20.5f)
            verticalLineTo(3f)
            close()
            moveToRelative(14f, 8.5f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-10f)
            curveTo(25f, 9.015f, 22.985f, 7f, 20.5f, 7f)
            horizontalLineToRelative(-10f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.build()
}
