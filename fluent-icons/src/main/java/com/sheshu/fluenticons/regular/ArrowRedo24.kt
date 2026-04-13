package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRedo24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRedo24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.25f, 2f)
            curveToRelative(-0.38f, 0f, -0.693f, 0.282f, -0.743f, 0.648f)
            lineTo(18.5f, 2.75f)
            verticalLineToRelative(5.69f)
            lineToRelative(-4.574f, -4.56f)
            curveToRelative(-2.442f, -2.442f, -6.364f, -2.5f, -8.878f, -0.179f)
            lineToRelative(-0.186f, 0.18f)
            curveToRelative(-2.503f, 2.502f, -2.503f, 6.56f, 0f, 9.063f)
            lineToRelative(8.845f, 8.84f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.06f, -0.001f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            lineToRelative(-8.845f, -8.84f)
            curveToRelative(-1.917f, -1.917f, -1.917f, -5.025f, 0f, -6.942f)
            curveToRelative(1.86f, -1.86f, 4.839f, -1.916f, 6.766f, -0.168f)
            lineToRelative(0.178f, 0.169f)
            lineTo(17.438f, 9.5f)
            horizontalLineTo(11.75f)
            curveToRelative(-0.38f, 0f, -0.693f, 0.282f, -0.743f, 0.648f)
            lineTo(11f, 10.25f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(11.75f, 11f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.648f)
            lineTo(20f, 10.25f)
            verticalLineToRelative(-7.5f)
            curveTo(20f, 2.336f, 19.664f, 2f, 19.25f, 2f)
            close()
        }
    }.build()
}
