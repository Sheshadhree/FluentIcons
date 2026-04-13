package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Desktop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Desktop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 22f)
            curveTo(6.336f, 22f, 6f, 21.665f, 6f, 21.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(6.75f, 20.5f)
            horizontalLineToRelative(1.749f)
            verticalLineToRelative(-2.498f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.19f, 0f, -2.166f, -0.925f, -2.245f, -2.096f)
            lineTo(2f, 15.752f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -1.19f, 0.925f, -2.166f, 2.096f, -2.245f)
            lineTo(4.25f, 3f)
            horizontalLineToRelative(15.499f)
            curveToRelative(1.19f, 0f, 2.166f, 0.925f, 2.245f, 2.096f)
            lineToRelative(0.005f, 0.154f)
            verticalLineToRelative(10.502f)
            curveToRelative(0f, 1.191f, -0.925f, 2.166f, -2.096f, 2.245f)
            lineToRelative(-0.154f, 0.005f)
            horizontalLineToRelative(-4.25f)
            verticalLineTo(20.5f)
            horizontalLineToRelative(1.751f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.744f)
            lineTo(17.25f, 22f)
            horizontalLineTo(6.75f)
            close()
            moveToRelative(7.248f, -3.998f)
            horizontalLineToRelative(-4f)
            lineTo(9.999f, 20.5f)
            horizontalLineToRelative(4f)
            lineToRelative(-0.001f, -2.498f)
            close()
            moveTo(19.748f, 4.5f)
            horizontalLineTo(4.25f)
            curveToRelative(-0.38f, 0f, -0.693f, 0.282f, -0.743f, 0.648f)
            lineTo(3.5f, 5.25f)
            verticalLineToRelative(10.502f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.648f, 0.743f)
            lineToRelative(0.102f, 0.007f)
            horizontalLineToRelative(15.499f)
            curveToRelative(0.38f, 0f, 0.693f, -0.282f, 0.743f, -0.648f)
            lineToRelative(0.007f, -0.102f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -0.38f, -0.282f, -0.694f, -0.648f, -0.743f)
            lineTo(19.749f, 4.5f)
            close()
        }
    }.build()
}
