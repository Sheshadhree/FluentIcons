package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Document48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Document48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            horizontalLineTo(12.25f)
            curveTo(9.903f, 4f, 8f, 5.903f, 8f, 8.25f)
            verticalLineToRelative(31.5f)
            curveTo(8f, 42.097f, 9.903f, 44f, 12.25f, 44f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(20f)
            horizontalLineTo(28.25f)
            curveTo(25.903f, 20f, 24f, 18.097f, 24f, 15.75f)
            verticalLineTo(4f)
            close()
            moveToRelative(15.626f, 13.5f)
            curveToRelative(-0.21f, -0.466f, -0.503f, -0.895f, -0.87f, -1.263f)
            lineTo(27.762f, 5.245f)
            curveToRelative(-0.369f, -0.368f, -0.797f, -0.662f, -1.263f, -0.871f)
            verticalLineTo(15.75f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(11.376f)
            close()
        }
    }.build()
}
