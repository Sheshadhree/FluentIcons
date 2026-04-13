package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBrush28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBrush28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 6.25f)
            curveTo(17f, 6.664f, 16.664f, 7f, 16.25f, 7f)
            reflectiveCurveTo(15.5f, 6.664f, 15.5f, 6.25f)
            verticalLineTo(2f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 2f, 6f, 2.336f, 6f, 2.75f)
            verticalLineTo(13f)
            horizontalLineToRelative(16f)
            verticalLineTo(2.75f)
            curveTo(22f, 2.336f, 21.664f, 2f, 21.25f, 2f)
            horizontalLineTo(20f)
            verticalLineToRelative(6.25f)
            curveTo(20f, 8.664f, 19.664f, 9f, 19.25f, 9f)
            reflectiveCurveTo(18.5f, 8.664f, 18.5f, 8.25f)
            verticalLineTo(2f)
            horizontalLineTo(17f)
            verticalLineToRelative(4.25f)
            close()
            moveTo(6f, 14.5f)
            verticalLineToRelative(1.75f)
            curveTo(6f, 17.768f, 7.231f, 19f, 8.75f, 19f)
            horizontalLineToRelative(2.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(19f)
            horizontalLineToRelative(2.75f)
            curveToRelative(1.52f, 0f, 2.75f, -1.232f, 2.75f, -2.75f)
            verticalLineTo(14.5f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
