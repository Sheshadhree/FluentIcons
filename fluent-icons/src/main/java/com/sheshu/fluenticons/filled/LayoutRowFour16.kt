package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutRowFour16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutRowFour16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(12f)
            verticalLineTo(8.5f)
            horizontalLineTo(2f)
            close()
            moveToRelative(12f, -1f)
            verticalLineTo(5f)
            horizontalLineTo(2f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(12f)
            close()
            moveTo(4.5f, 14f)
            curveToRelative(-1.21f, 0f, -2.218f, -0.859f, -2.45f, -2f)
            horizontalLineToRelative(11.9f)
            curveToRelative(-0.232f, 1.141f, -1.24f, 2f, -2.45f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(9.45f, -10f)
            curveToRelative(-0.232f, -1.141f, -1.24f, -2f, -2.45f, -2f)
            horizontalLineToRelative(-7f)
            curveTo(3.29f, 2f, 2.282f, 2.859f, 2.05f, 4f)
            horizontalLineToRelative(11.9f)
            close()
        }
    }.build()
}
