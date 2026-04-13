package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pipeline20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pipeline20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.5f)
            curveTo(2f, 4.672f, 2.672f, 4f, 3.5f, 4f)
            reflectiveCurveTo(5f, 4.671f, 5f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(5f, 15.33f, 4.328f, 16f, 3.5f, 16f)
            reflectiveCurveTo(2f, 15.328f, 2f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(13f, 0f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(18f, 4.672f, 17.328f, 4f, 16.5f, 4f)
            reflectiveCurveTo(15f, 4.672f, 15f, 5.5f)
            close()
            moveTo(14f, 14f)
            verticalLineTo(6f)
            horizontalLineTo(6f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(8f)
            close()
        }
    }.build()
}
