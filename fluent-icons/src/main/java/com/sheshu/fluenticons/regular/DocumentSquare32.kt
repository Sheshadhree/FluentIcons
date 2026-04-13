package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentSquare32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentSquare32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.068f, 3f)
            curveToRelative(0.862f, 0f, 1.689f, 0.343f, 2.298f, 0.952f)
            lineToRelative(6.682f, 6.682f)
            curveTo(28.658f, 11.244f, 29f, 12.07f, 29f, 12.932f)
            verticalLineTo(25.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 29f, 3f, 27.545f, 3f, 25.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(12.818f)
            close()
            moveTo(6.25f, 5f)
            curveTo(5.56f, 5f, 5f, 5.56f, 5f, 6.25f)
            verticalLineToRelative(19.5f)
            curveTo(5f, 26.44f, 5.56f, 27f, 6.25f, 27f)
            horizontalLineToRelative(19.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(14f)
            horizontalLineToRelative(-5.75f)
            curveTo(19.455f, 14f, 18f, 12.545f, 18f, 10.75f)
            verticalLineTo(5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(20f, 10.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.336f)
            lineTo(20f, 5.414f)
            verticalLineToRelative(5.336f)
            close()
        }
    }.build()
}
