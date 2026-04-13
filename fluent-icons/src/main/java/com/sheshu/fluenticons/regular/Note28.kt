package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Note28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Note28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(4.679f, 3f, 3f, 4.679f, 3f, 6.75f)
            verticalLineToRelative(14.5f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineToRelative(8.507f)
            curveToRelative(0.995f, 0f, 1.949f, -0.395f, 2.652f, -1.098f)
            lineToRelative(5.993f, -5.993f)
            curveTo(24.605f, 17.206f, 25f, 16.252f, 25f, 15.257f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(6.75f)
            close()
            moveTo(4.5f, 6.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(-4.75f)
            curveTo(16.679f, 15f, 15f, 16.679f, 15f, 18.75f)
            verticalLineToRelative(4.75f)
            horizontalLineTo(6.75f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(6.75f)
            close()
            moveToRelative(12f, 16.376f)
            verticalLineTo(18.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(4.376f)
            curveToRelative(-0.083f, 0.124f, -0.178f, 0.241f, -0.285f, 0.348f)
            lineToRelative(-5.993f, 5.993f)
            curveToRelative(-0.107f, 0.107f, -0.224f, 0.202f, -0.348f, 0.285f)
            close()
        }
    }.build()
}
