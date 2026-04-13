package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.4f, 2.818f)
            curveToRelative(-0.094f, -0.114f, -0.235f, -0.18f, -0.383f, -0.18f)
            curveToRelative(-0.149f, 0f, -0.29f, 0.066f, -0.384f, 0.18f)
            curveToRelative(-1.197f, 1.435f, -3.558f, 3.14f, -4.916f, 3.898f)
            curveTo(4.58f, 6.793f, 4.487f, 6.93f, 4.465f, 7.084f)
            lineTo(3.375f, 15f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 15f, 2f, 15.224f, 2f, 15.5f)
            reflectiveCurveTo(2.224f, 16f, 2.5f, 16f)
            horizontalLineToRelative(3.936f)
            curveToRelative(0.033f, 0.007f, 0.066f, 0.01f, 0.1f, 0.01f)
            horizontalLineToRelative(6.906f)
            curveToRelative(0.034f, 0f, 0.067f, -0.003f, 0.1f, -0.01f)
            horizontalLineTo(17.5f)
            curveToRelative(0.277f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.777f, 15f, 17.5f, 15f)
            horizontalLineToRelative(-0.84f)
            lineToRelative(-1.09f, -7.916f)
            curveToRelative(-0.022f, -0.155f, -0.115f, -0.291f, -0.252f, -0.368f)
            curveToRelative(-1.358f, -0.758f, -3.72f, -2.463f, -4.916f, -3.898f)
            close()
            moveTo(7.516f, 15.01f)
            curveTo(8.354f, 13.79f, 9.219f, 12.224f, 10f, 9.749f)
            curveToRelative(0.706f, 2.233f, 1.493f, 3.776f, 2.486f, 5.261f)
            horizontalLineTo(7.514f)
            close()
        }
    }.build()
}
