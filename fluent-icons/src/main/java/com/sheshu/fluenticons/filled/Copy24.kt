package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Copy24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Copy24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.503f, 4.627f)
            lineTo(5.5f, 6.75f)
            verticalLineToRelative(10.504f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(8.616f)
            curveToRelative(-0.309f, 0.874f, -1.142f, 1.5f, -2.122f, 1.5f)
            horizontalLineTo(8.75f)
            curveToRelative(-2.623f, 0f, -4.75f, -2.126f, -4.75f, -4.75f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -0.98f, 0.627f, -1.815f, 1.503f, -2.123f)
            close()
            moveTo(17.75f, 2f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-9f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-13f)
            curveTo(6.5f, 3.007f, 7.507f, 2f, 8.75f, 2f)
            horizontalLineToRelative(9f)
            close()
        }
    }.build()
}
