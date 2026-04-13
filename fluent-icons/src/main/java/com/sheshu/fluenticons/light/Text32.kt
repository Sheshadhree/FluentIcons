package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Text32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Text32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineToRelative(19f)
            curveTo(25.776f, 4f, 26f, 4.224f, 26f, 4.5f)
            verticalLineToRelative(4f)
            curveTo(26f, 8.776f, 25.776f, 9f, 25.5f, 9f)
            reflectiveCurveTo(25f, 8.776f, 25f, 8.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(-8.5f)
            verticalLineToRelative(22f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(19.776f, 28f, 19.5f, 28f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            verticalLineTo(5f)
            horizontalLineTo(7f)
            verticalLineToRelative(3.5f)
            curveTo(7f, 8.776f, 6.776f, 9f, 6.5f, 9f)
            reflectiveCurveTo(6f, 8.776f, 6f, 8.5f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}
