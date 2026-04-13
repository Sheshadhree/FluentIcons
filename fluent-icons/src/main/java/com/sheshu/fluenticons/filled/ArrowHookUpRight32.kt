package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.866f, 5.866f)
            curveTo(19.324f, 5.41f, 20.048f, 5.38f, 20.54f, 5.78f)
            lineToRelative(0.095f, 0.086f)
            lineToRelative(5f, 5f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineTo(21.732f, 13f)
            horizontalLineTo(13.25f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            reflectiveCurveToRelative(2.127f, 4.75f, 4.75f, 4.75f)
            horizontalLineTo(22f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(22.69f, 25f, 22f, 25f)
            horizontalLineToRelative(-8.75f)
            curveTo(9.246f, 25f, 6f, 21.754f, 6f, 17.75f)
            reflectiveCurveToRelative(3.246f, -7.25f, 7.25f, -7.25f)
            horizontalLineToRelative(8.482f)
            lineToRelative(-2.866f, -2.866f)
            lineToRelative(-0.086f, -0.095f)
            curveToRelative(-0.4f, -0.49f, -0.372f, -1.215f, 0.086f, -1.673f)
            close()
        }
    }.build()
}
