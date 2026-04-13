package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoPerson24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPerson24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.745f, 4f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(11.505f)
            curveToRelative(0f, 1.242f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.008f, -2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineToRelative(15.495f)
            close()
            moveToRelative(0f, 1.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineToRelative(11.505f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            lineToRelative(2.749f, -0.001f)
            lineTo(7f, 15.75f)
            curveToRelative(0f, -0.918f, 0.707f, -1.671f, 1.607f, -1.744f)
            lineTo(8.75f, 14f)
            horizontalLineToRelative(6.495f)
            curveToRelative(0.918f, 0f, 1.67f, 0.707f, 1.744f, 1.607f)
            lineToRelative(0.006f, 0.143f)
            lineToRelative(-0.001f, 2.754f)
            horizontalLineToRelative(2.751f)
            curveToRelative(0.415f, 0f, 0.75f, -0.335f, 0.75f, -0.75f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.414f, -0.335f, -0.75f, -0.75f, -0.75f)
            close()
            moveTo(12f, 7f)
            curveToRelative(1.657f, 0f, 3f, 1.344f, 3f, 3f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -1.656f, 1.343f, -3f, 3f, -3f)
            close()
        }
    }.build()
}
