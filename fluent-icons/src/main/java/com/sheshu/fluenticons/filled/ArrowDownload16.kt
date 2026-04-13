package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownload16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownload16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(12.5f, 14.5f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(3.5f, 13f)
            horizontalLineToRelative(9f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7.898f, 1.007f)
            lineTo(8f, 1f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(8.75f, 1.75f)
            verticalLineToRelative(7.688f)
            lineToRelative(2.255f, -2.254f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.977f, -0.072f)
            lineToRelative(0.084f, 0.072f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.977f)
            lineToRelative(-0.072f, 0.084f)
            lineTo(8.53f, 11.78f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(7.47f, 11.78f)
            lineTo(3.934f, 8.245f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            curveTo(4.2f, 6.917f, 4.617f, 6.893f, 4.911f, 7.111f)
            lineToRelative(0.084f, 0.072f)
            lineTo(7.25f, 9.44f)
            verticalLineTo(1.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(8f, 1f)
            lineTo(7.898f, 1.007f)
            close()
        }
    }.build()
}
