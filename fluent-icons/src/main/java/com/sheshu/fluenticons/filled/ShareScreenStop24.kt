package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenStop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenStop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4f)
            horizontalLineToRelative(15.5f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            close()
            moveToRelative(5.03f, 4.215f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            lineToRelative(2.72f, 2.72f)
            lineToRelative(-2.72f, 2.725f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.06f, 0f)
            lineTo(12f, 13.057f)
            lineToRelative(2.724f, 2.723f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.06f, 0f)
            curveToRelative(0.294f, -0.293f, 0.294f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.723f, -2.724f)
            lineToRelative(2.723f, -2.715f)
            curveToRelative(0.293f, -0.292f, 0.294f, -0.767f, 0.002f, -1.06f)
            curveToRelative(-0.293f, -0.294f, -0.768f, -0.295f, -1.061f, -0.002f)
            lineTo(12f, 10.936f)
            lineToRelative(-2.72f, -2.72f)
            close()
        }
    }.build()
}
