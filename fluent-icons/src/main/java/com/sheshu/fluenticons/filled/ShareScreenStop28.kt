package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenStop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenStop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4.999f)
            horizontalLineToRelative(19.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 23f, 2f, 21.993f, 2f, 20.75f)
            verticalLineTo(7.25f)
            curveTo(2f, 6.007f, 3.007f, 5f, 4.25f, 5f)
            close()
            moveToRelative(7.028f, 5.218f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            lineToRelative(2.72f, 2.72f)
            lineToRelative(-2.721f, 2.725f)
            curveToRelative(-0.293f, 0.293f, -0.292f, 0.768f, 0f, 1.06f)
            curveToRelative(0.294f, 0.293f, 0.769f, 0.293f, 1.061f, 0f)
            lineToRelative(2.72f, -2.723f)
            lineToRelative(2.724f, 2.723f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.06f, 0f)
            curveToRelative(0.294f, -0.293f, 0.294f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.723f, -2.724f)
            lineToRelative(2.723f, -2.715f)
            curveToRelative(0.293f, -0.292f, 0.294f, -0.767f, 0.001f, -1.06f)
            curveToRelative(-0.292f, -0.294f, -0.767f, -0.295f, -1.06f, -0.002f)
            lineToRelative(-2.724f, 2.716f)
            lineToRelative(-2.72f, -2.72f)
            close()
        }
    }.build()
}
