package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flag48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flag48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 6f)
            curveTo(8.06f, 6f, 7.5f, 6.56f, 7.5f, 7.25f)
            verticalLineToRelative(35.5f)
            curveTo(7.5f, 43.44f, 8.06f, 44f, 8.75f, 44f)
            reflectiveCurveTo(10f, 43.44f, 10f, 42.75f)
            verticalLineTo(33f)
            horizontalLineToRelative(31.25f)
            curveToRelative(0.471f, 0f, 0.902f, -0.265f, 1.115f, -0.685f)
            curveToRelative(0.213f, -0.42f, 0.171f, -0.925f, -0.108f, -1.305f)
            lineTo(33.801f, 19.5f)
            lineToRelative(8.456f, -11.51f)
            curveToRelative(0.28f, -0.38f, 0.321f, -0.884f, 0.108f, -1.304f)
            curveTo(42.152f, 6.264f, 41.721f, 6f, 41.25f, 6f)
            horizontalLineTo(8.75f)
            close()
        }
    }.build()
}
