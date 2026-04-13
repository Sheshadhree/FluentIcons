package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutRowTwo48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutRowTwo48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 6f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineToRelative(10.5f)
            horizontalLineToRelative(36f)
            verticalLineToRelative(-10.5f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            horizontalLineToRelative(-23.5f)
            close()
            moveTo(42f, 25.25f)
            horizontalLineTo(6f)
            verticalLineToRelative(10.5f)
            curveTo(6f, 39.202f, 8.798f, 42f, 12.25f, 42f)
            horizontalLineToRelative(23.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-10.5f)
            close()
        }
    }.build()
}
