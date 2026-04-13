package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(4.254f)
            verticalLineToRelative(4.747f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineTo(17.5f)
            verticalLineToRelative(8.253f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-9f)
            curveTo(5.007f, 19.5f, 4f, 18.493f, 4f, 17.25f)
            verticalLineToRelative(-13f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.004f, 6.747f)
            verticalLineToRelative(-4.28f)
            curveToRelative(0.076f, 0.06f, 0.15f, 0.123f, 0.218f, 0.192f)
            lineToRelative(4.619f, 4.619f)
            curveToRelative(0.07f, 0.07f, 0.134f, 0.143f, 0.193f, 0.22f)
            horizontalLineToRelative(-4.28f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveTo(8.75f, 22f)
            curveToRelative(-0.979f, 0f, -1.812f, -0.626f, -2.121f, -1.5f)
            horizontalLineToRelative(8.622f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(8.937f)
            lineToRelative(0.84f, 0.84f)
            curveToRelative(0.423f, 0.423f, 0.66f, 0.995f, 0.66f, 1.592f)
            verticalLineToRelative(5.881f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
