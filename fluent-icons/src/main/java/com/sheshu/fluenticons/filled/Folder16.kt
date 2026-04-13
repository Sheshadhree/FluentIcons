package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Folder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Folder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 4.5f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            horizontalLineToRelative(2.086f)
            curveToRelative(0.398f, 0f, 0.78f, 0.158f, 1.06f, 0.44f)
            lineTo(8f, 3.792f)
            lineToRelative(-2.06f, 2.06f)
            curveTo(5.845f, 5.948f, 5.717f, 6f, 5.585f, 6f)
            horizontalLineTo(1f)
            verticalLineTo(4.5f)
            close()
            moveTo(1f, 7f)
            verticalLineToRelative(4.5f)
            curveTo(1f, 12.88f, 2.12f, 14f, 3.5f, 14f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(15f, 5.12f, 13.88f, 4f, 12.5f, 4f)
            horizontalLineTo(9.207f)
            lineToRelative(-2.56f, 2.56f)
            curveTo(6.364f, 6.843f, 5.983f, 7f, 5.585f, 7f)
            horizontalLineTo(1f)
            close()
        }
    }.build()
}
