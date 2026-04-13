package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desktop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desktop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineToRelative(21.5f)
            curveTo(28.545f, 3f, 30f, 4.455f, 30f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.744f)
            verticalLineToRelative(2.001f)
            horizontalLineToRelative(2.998f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.551f, -0.448f, 0.999f, -1f, 0.999f)
            horizontalLineTo(9.012f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            curveToRelative(0f, -0.551f, 0.448f, -0.999f, 1f, -0.999f)
            horizontalLineToRelative(2.998f)
            verticalLineTo(25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 25f, 2f, 23.545f, 2f, 21.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(14.01f, 25f)
            verticalLineToRelative(2.001f)
            horizontalLineToRelative(3.996f)
            verticalLineTo(25f)
            horizontalLineTo(14.01f)
            close()
        }
    }.build()
}
