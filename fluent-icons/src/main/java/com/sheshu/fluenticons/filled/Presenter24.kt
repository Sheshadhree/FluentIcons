package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Presenter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Presenter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.245f, 12.997f)
            curveToRelative(0.709f, 0f, 1.022f, 0.892f, 0.469f, 1.335f)
            lineToRelative(-4.718f, 3.778f)
            verticalLineToRelative(1.644f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(10.25f)
            curveToRelative(-1.242f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(18.11f)
            lineToRelative(-4.72f, -3.778f)
            curveToRelative(-0.553f, -0.443f, -0.24f, -1.335f, 0.47f, -1.335f)
            horizontalLineToRelative(16.495f)
            close()
            moveTo(8.75f, 8.999f)
            horizontalLineToRelative(6.495f)
            curveToRelative(0.918f, 0f, 1.671f, 0.708f, 1.744f, 1.607f)
            lineToRelative(0.006f, 0.143f)
            verticalLineTo(12f)
            horizontalLineTo(7f)
            verticalLineToRelative(-1.25f)
            curveToRelative(0f, -0.918f, 0.708f, -1.67f, 1.607f, -1.744f)
            lineTo(8.75f, 9f)
            horizontalLineToRelative(6.495f)
            horizontalLineTo(8.75f)
            close()
            moveTo(12f, 2f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            curveToRelative(-1.656f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.344f, -3f, 3f, -3f)
            close()
        }
    }.build()
}
