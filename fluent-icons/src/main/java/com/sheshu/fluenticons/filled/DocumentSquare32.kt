package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentSquare32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSquare32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10.75f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineTo(29f)
            verticalLineToRelative(11.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 29f, 3f, 27.545f, 3f, 25.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(18f)
            verticalLineToRelative(7.75f)
            close()
            moveToRelative(2f, -7.613f)
            curveToRelative(0.511f, 0.153f, 0.982f, 0.43f, 1.366f, 0.815f)
            lineToRelative(6.682f, 6.682f)
            curveToRelative(0.384f, 0.384f, 0.662f, 0.855f, 0.815f, 1.366f)
            horizontalLineTo(21.25f)
            curveTo(20.56f, 12f, 20f, 11.44f, 20f, 10.75f)
            verticalLineTo(3.137f)
            close()
        }
    }.build()
}
