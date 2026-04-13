package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitVertical48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitVertical48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.5f, 5.25f)
            curveTo(25.5f, 4.56f, 24.94f, 4f, 24.25f, 4f)
            reflectiveCurveTo(23f, 4.56f, 23f, 5.25f)
            verticalLineToRelative(37.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(39.75f, 40f)
            horizontalLineTo(27.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(12.25f)
            curveTo(42.097f, 8f, 44f, 9.903f, 44f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            close()
            moveTo(21f, 8f)
            horizontalLineTo(8.25f)
            curveTo(5.903f, 8f, 4f, 9.903f, 4f, 12.25f)
            verticalLineToRelative(23.5f)
            curveTo(4f, 38.097f, 5.903f, 40f, 8.25f, 40f)
            horizontalLineTo(21f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
