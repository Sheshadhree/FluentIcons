package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Document32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Document32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 5.25f)
            verticalLineToRelative(21.5f)
            curveTo(7f, 27.44f, 7.56f, 28f, 8.25f, 28f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(13f)
            horizontalLineToRelative(-5.75f)
            curveTo(17.455f, 13f, 16f, 11.545f, 16f, 9.75f)
            verticalLineTo(4f)
            horizontalLineTo(8.25f)
            curveTo(7.56f, 4f, 7f, 4.56f, 7f, 5.25f)
            close()
            moveTo(24.586f, 11f)
            lineTo(18f, 4.414f)
            verticalLineTo(9.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.336f)
            close()
            moveTo(27f, 26.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(8.25f)
            curveTo(6.455f, 30f, 5f, 28.545f, 5f, 26.75f)
            verticalLineTo(5.25f)
            curveTo(5f, 3.455f, 6.455f, 2f, 8.25f, 2f)
            horizontalLineToRelative(8.818f)
            curveToRelative(0.862f, 0f, 1.689f, 0.342f, 2.298f, 0.952f)
            lineToRelative(6.682f, 6.682f)
            curveTo(26.658f, 10.244f, 27f, 11.07f, 27f, 11.932f)
            verticalLineTo(26.75f)
            close()
        }
    }.build()
}
