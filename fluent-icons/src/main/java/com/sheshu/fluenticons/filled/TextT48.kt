package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextT48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextT48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 9.5f)
            curveTo(10f, 8.672f, 10.672f, 8f, 11.5f, 8f)
            horizontalLineToRelative(25f)
            curveTo(37.328f, 8f, 38f, 8.672f, 38f, 9.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(35f, 14.328f, 35f, 13.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(-9.5f)
            verticalLineToRelative(26f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(29.328f, 40f, 28.5f, 40f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            verticalLineTo(11f)
            horizontalLineTo(13f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(10f, 14.328f, 10f, 13.5f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}
