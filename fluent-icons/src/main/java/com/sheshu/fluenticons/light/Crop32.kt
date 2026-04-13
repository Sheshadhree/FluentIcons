package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Crop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Crop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2.5f)
            curveTo(8f, 2.224f, 7.776f, 2f, 7.5f, 2f)
            reflectiveCurveTo(7f, 2.224f, 7f, 2.5f)
            verticalLineTo(7f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 7f, 2f, 7.224f, 2f, 7.5f)
            reflectiveCurveTo(2.224f, 8f, 2.5f, 8f)
            horizontalLineTo(7f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineTo(24f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(25f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(29.776f, 24f, 29.5f, 24f)
            horizontalLineToRelative(-18f)
            curveTo(9.567f, 24f, 8f, 22.433f, 8f, 20.5f)
            verticalLineToRelative(-18f)
            close()
            moveTo(20.5f, 8f)
            horizontalLineToRelative(-11f)
            verticalLineTo(7f)
            horizontalLineToRelative(11f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-11f)
            curveTo(24f, 9.567f, 22.433f, 8f, 20.5f, 8f)
            close()
        }
    }.build()
}
