package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ScaleFit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScaleFit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
            horizontalLineTo(4.25f)
            close()
            moveToRelative(3.744f, 5.436f)
            curveToRelative(0.312f, 0.272f, 0.343f, 0.746f, 0.07f, 1.058f)
            lineTo(7.403f, 11.25f)
            horizontalLineToRelative(2.862f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(7.403f)
            lineToRelative(0.661f, 0.756f)
            curveToRelative(0.273f, 0.312f, 0.242f, 0.786f, -0.07f, 1.058f)
            curveToRelative(-0.312f, 0.273f, -0.786f, 0.242f, -1.058f, -0.07f)
            lineToRelative(-1.75f, -2f)
            curveToRelative(-0.248f, -0.283f, -0.248f, -0.705f, 0f, -0.988f)
            lineToRelative(1.75f, -2f)
            curveToRelative(0.272f, -0.312f, 0.746f, -0.343f, 1.058f, -0.07f)
            close()
            moveToRelative(7.956f, 1.058f)
            curveToRelative(-0.272f, -0.312f, -0.241f, -0.786f, 0.07f, -1.058f)
            curveToRelative(0.313f, -0.273f, 0.786f, -0.242f, 1.06f, 0.07f)
            lineToRelative(1.75f, 2f)
            curveToRelative(0.247f, 0.283f, 0.247f, 0.705f, 0f, 0.988f)
            lineToRelative(-1.75f, 2f)
            curveToRelative(-0.274f, 0.312f, -0.747f, 0.343f, -1.06f, 0.07f)
            curveToRelative(-0.311f, -0.272f, -0.342f, -0.746f, -0.07f, -1.058f)
            lineToRelative(0.662f, -0.756f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 12.75f, 13f, 12.414f, 13f, 12f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(2.862f)
            lineToRelative(-0.662f, -0.756f)
            close()
        }
    }.build()
}
