package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpenVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpenVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 1f)
            horizontalLineTo(6.534f)
            lineTo(8.25f, 1.991f)
            curveTo(9.333f, 2.616f, 10f, 3.771f, 10f, 5.022f)
            verticalLineToRelative(7.928f)
            curveToRelative(1.141f, -0.232f, 2f, -1.24f, 2f, -2.45f)
            verticalLineTo(7.207f)
            lineToRelative(1.56f, -1.56f)
            curveTo(13.843f, 5.364f, 14f, 4.983f, 14f, 4.585f)
            verticalLineTo(3.5f)
            curveTo(14f, 2.12f, 12.88f, 1f, 11.5f, 1f)
            close()
            moveTo(9f, 5.022f)
            verticalLineToRelative(7.973f)
            curveToRelative(0f, 1.54f, -1.667f, 2.502f, -3f, 1.732f)
            lineToRelative(-2.745f, -1.585f)
            curveToRelative(-0.774f, -0.446f, -1.25f, -1.271f, -1.25f, -2.165f)
            verticalLineTo(3.004f)
            curveToRelative(0f, -1.54f, 1.667f, -2.502f, 3f, -1.732f)
            lineTo(7.75f, 2.857f)
            curveTo(8.524f, 3.304f, 9f, 4.13f, 9f, 5.022f)
            close()
        }
    }.build()
}
