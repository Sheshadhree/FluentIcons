package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentHeader24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentHeader24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.505f, 5.005f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.671f, -1.5f, 1.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.829f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            curveToRelative(0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(11.49f, -0.909f)
            curveTo(19.915f, 2.926f, 18.94f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.926f, 2.085f, 4f, 3.06f, 4f, 4.25f)
            verticalLineToRelative(15.5f)
            lineToRelative(0.005f, 0.154f)
            curveTo(4.085f, 21.074f, 5.06f, 22f, 6.25f, 22f)
            horizontalLineToRelative(11.5f)
            lineToRelative(0.154f, -0.005f)
            curveTo(19.074f, 21.915f, 20f, 20.94f, 20f, 19.75f)
            verticalLineTo(4.25f)
            lineToRelative(-0.005f, -0.154f)
            close()
            moveTo(6.25f, 3.5f)
            horizontalLineToRelative(11.5f)
            lineToRelative(0.102f, 0.007f)
            curveTo(18.218f, 3.557f, 18.5f, 3.87f, 18.5f, 4.25f)
            verticalLineToRelative(15.5f)
            lineToRelative(-0.007f, 0.102f)
            curveToRelative(-0.05f, 0.366f, -0.363f, 0.648f, -0.743f, 0.648f)
            horizontalLineTo(6.25f)
            lineToRelative(-0.102f, -0.007f)
            curveTo(5.782f, 20.443f, 5.5f, 20.13f, 5.5f, 19.75f)
            verticalLineTo(4.25f)
            lineToRelative(0.007f, -0.102f)
            curveTo(5.557f, 3.782f, 5.87f, 3.5f, 6.25f, 3.5f)
            close()
        }
    }.build()
}
