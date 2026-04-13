package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DualScreenStatusBar24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenStatusBar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.245f, 4.004f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(18.25f)
            curveToRelative(0f, 0.966f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-7.247f)
            curveToRelative(-0.087f, 0f, -0.172f, -0.007f, -0.256f, -0.019f)
            verticalLineTo(4.023f)
            curveToRelative(0.083f, -0.012f, 0.169f, -0.019f, 0.256f, -0.019f)
            horizontalLineToRelative(7.247f)
            close()
            moveToRelative(-9.247f, -0.002f)
            curveToRelative(0.083f, 0f, 0.165f, 0.006f, 0.245f, 0.017f)
            verticalLineTo(19.98f)
            curveToRelative(-0.08f, 0.011f, -0.162f, 0.017f, -0.245f, 0.017f)
            horizontalLineTo(3.75f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            verticalLineTo(5.752f)
            curveToRelative(0f, -0.967f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(7.248f)
            close()
            moveTo(19.75f, 6.5f)
            horizontalLineToRelative(-4.502f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.335f, -0.75f, 0.75f)
            curveToRelative(0f, 0.38f, 0.283f, 0.693f, 0.649f, 0.743f)
            lineTo(15.248f, 8f)
            horizontalLineToRelative(4.502f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.38f, -0.282f, -0.694f, -0.648f, -0.743f)
            lineTo(19.75f, 6.5f)
            close()
        }
    }.build()
}
