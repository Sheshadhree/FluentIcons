package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Filter32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Filter32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 8.5f)
            curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
            horizontalLineToRelative(25f)
            curveTo(28.776f, 8f, 29f, 8.224f, 29f, 8.5f)
            reflectiveCurveTo(28.776f, 9f, 28.5f, 9f)
            horizontalLineToRelative(-25f)
            curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
            close()
            moveToRelative(4f, 7f)
            curveTo(7f, 15.224f, 7.224f, 15f, 7.5f, 15f)
            horizontalLineToRelative(17f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(24.776f, 16f, 24.5f, 16f)
            horizontalLineToRelative(-17f)
            curveTo(7.224f, 16f, 7f, 15.776f, 7f, 15.5f)
            close()
            moveToRelative(4.5f, 6.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(20.776f, 22f, 20.5f, 22f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
