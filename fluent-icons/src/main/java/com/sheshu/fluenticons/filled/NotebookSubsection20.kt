package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NotebookSubsection20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NotebookSubsection20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.5f)
            curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
            horizontalLineTo(10f)
            curveToRelative(0.818f, 0f, 1.544f, 0.393f, 2f, 1f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 3f, 5f, 4.12f, 5f, 5.5f)
            verticalLineTo(15f)
            curveToRelative(-0.607f, -0.456f, -1f, -1.182f, -1f, -2f)
            verticalLineTo(5.5f)
            close()
            moveTo(13.5f, 2f)
            lineToRelative(-0.068f, 0.006f)
            curveTo(13.188f, 2.046f, 13f, 2.296f, 13f, 2.6f)
            verticalLineTo(4f)
            horizontalLineTo(7.5f)
            curveTo(6.672f, 4f, 6f, 4.672f, 6f, 5.5f)
            verticalLineToRelative(10f)
            curveTo(6f, 16.328f, 6.672f, 17f, 7.5f, 17f)
            horizontalLineTo(13f)
            verticalLineToRelative(0.4f)
            lineToRelative(0.005f, 0.081f)
            curveTo(13.038f, 17.774f, 13.247f, 18f, 13.5f, 18f)
            curveToRelative(0.276f, 0f, 0.5f, -0.269f, 0.5f, -0.6f)
            verticalLineTo(2.6f)
            lineToRelative(-0.005f, -0.081f)
            curveTo(13.962f, 2.226f, 13.753f, 2f, 13.5f, 2f)
            close()
        }
    }.build()
}
