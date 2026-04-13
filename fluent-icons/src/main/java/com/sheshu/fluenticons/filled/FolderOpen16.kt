package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpen16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpen16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 4.5f)
            verticalLineToRelative(4.966f)
            lineTo(1.991f, 7.75f)
            curveTo(2.616f, 6.667f, 3.771f, 6f, 5.022f, 6f)
            horizontalLineToRelative(7.928f)
            curveToRelative(-0.232f, -1.141f, -1.24f, -2f, -2.45f, -2f)
            horizontalLineTo(7.207f)
            lineToRelative(-1.56f, -1.56f)
            curveTo(5.364f, 2.157f, 4.983f, 2f, 4.585f, 2f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 2f, 1f, 3.12f, 1f, 4.5f)
            close()
            moveTo(5.022f, 7f)
            horizontalLineToRelative(7.973f)
            curveToRelative(1.54f, 0f, 2.502f, 1.667f, 1.732f, 3f)
            lineToRelative(-1.585f, 2.745f)
            curveToRelative(-0.446f, 0.774f, -1.271f, 1.25f, -2.165f, 1.25f)
            horizontalLineTo(3.004f)
            curveToRelative(-1.54f, 0f, -2.502f, -1.666f, -1.732f, -3f)
            lineTo(2.857f, 8.25f)
            curveTo(3.304f, 7.476f, 4.13f, 7f, 5.022f, 7f)
            close()
        }
    }.build()
}
