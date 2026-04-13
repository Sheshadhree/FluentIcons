package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentHeaderFooter24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentHeaderFooter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.75f, 2f)
            curveToRelative(1.19f, 0f, 2.166f, 0.925f, 2.245f, 2.096f)
            lineTo(20f, 4.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.19f, -0.925f, 2.166f, -2.096f, 2.245f)
            lineTo(17.75f, 22f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.19f, 0f, -2.166f, -0.925f, -2.245f, -2.096f)
            lineTo(4f, 19.75f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -1.19f, 0.925f, -2.166f, 2.096f, -2.245f)
            lineTo(6.25f, 2f)
            horizontalLineToRelative(11.5f)
            close()
            moveTo(7.005f, 6.505f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.829f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            curveToRelative(0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.671f, -1.5f, 1.5f)
            close()
            moveToRelative(0f, 11f)
            curveToRelative(0f, 0.83f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.829f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            close()
        }
    }.build()
}
