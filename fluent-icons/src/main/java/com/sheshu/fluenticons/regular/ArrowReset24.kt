package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowReset24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReset24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.78f, 2.72f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(4.56f, 6f)
            horizontalLineToRelative(8.69f)
            curveTo(17.53f, 6f, 21f, 9.47f, 21f, 13.75f)
            curveToRelative(0f, 4.28f, -3.47f, 7.75f, -7.75f, 7.75f)
            curveToRelative(-4.28f, 0f, -7.75f, -3.47f, -7.75f, -7.75f)
            curveTo(5.5f, 13.336f, 5.836f, 13f, 6.25f, 13f)
            reflectiveCurveTo(7f, 13.336f, 7f, 13.75f)
            curveTo(7f, 17.202f, 9.798f, 20f, 13.25f, 20f)
            reflectiveCurveToRelative(6.25f, -2.798f, 6.25f, -6.25f)
            reflectiveCurveToRelative(-2.798f, -6.25f, -6.25f, -6.25f)
            horizontalLineTo(4.56f)
            lineToRelative(2.22f, 2.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
        }
    }.build()
}
