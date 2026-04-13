package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Battery028: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Battery028",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 7f)
            curveTo(3.679f, 7f, 2f, 8.679f, 2f, 10.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 19.321f, 3.679f, 21f, 5.75f, 21f)
            horizontalLineToRelative(14.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(16f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1.25f)
            curveTo(24f, 8.679f, 22.321f, 7f, 20.25f, 7f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}
