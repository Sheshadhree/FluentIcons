package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Document32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Document32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            horizontalLineTo(8.25f)
            curveTo(6.455f, 2f, 5f, 3.455f, 5f, 5.25f)
            verticalLineToRelative(21.5f)
            curveTo(5f, 28.545f, 6.455f, 30f, 8.25f, 30f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(13f)
            horizontalLineToRelative(-7.75f)
            curveTo(17.455f, 13f, 16f, 11.545f, 16f, 9.75f)
            verticalLineTo(2f)
            close()
            moveToRelative(10.863f, 9f)
            curveToRelative(-0.153f, -0.511f, -0.43f, -0.982f, -0.815f, -1.366f)
            lineToRelative(-6.682f, -6.682f)
            curveTo(18.982f, 2.568f, 18.511f, 2.29f, 18f, 2.136f)
            verticalLineTo(9.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(7.613f)
            close()
        }
    }.build()
}
