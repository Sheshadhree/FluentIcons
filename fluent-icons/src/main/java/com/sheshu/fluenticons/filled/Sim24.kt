package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Sim24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Sim24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineToRelative(5.464f)
            curveToRelative(0.862f, 0f, 1.69f, 0.342f, 2.299f, 0.952f)
            lineToRelative(4.035f, 4.035f)
            curveTo(19.658f, 7.597f, 20f, 8.424f, 20f, 9.286f)
            verticalLineToRelative(9.464f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-9.5f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(7.75f, 14f)
            horizontalLineTo(12f)
            verticalLineToRelative(-3.25f)
            horizontalLineTo(9.25f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineTo(14f)
            close()
            moveToRelative(0f, 1.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(12f)
            verticalLineTo(15.5f)
            horizontalLineTo(7.75f)
            close()
            moveToRelative(5.75f, 2.75f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(13.5f)
            verticalLineToRelative(7.5f)
            close()
        }
    }.build()
}
