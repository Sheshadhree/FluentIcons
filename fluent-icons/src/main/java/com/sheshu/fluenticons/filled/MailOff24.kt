package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.25f, 1.25f)
            curveToRelative(-0.8f, 0.525f, -1.354f, 1.392f, -1.454f, 2.394f)
            lineToRelative(8.078f, 4.231f)
            lineToRelative(2.422f, 2.421f)
            lineToRelative(-0.168f, 0.088f)
            curveToRelative(-0.218f, 0.115f, -0.478f, 0.115f, -0.696f, 0f)
            lineTo(2f, 8.608f)
            verticalLineToRelative(8.142f)
            lineToRelative(0.005f, 0.184f)
            curveTo(2.101f, 18.644f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineToRelative(13.5f)
            lineToRelative(0.184f, -0.005f)
            lineToRelative(1.785f, 1.785f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(12.02f, 9.898f)
            lineToRelative(6.262f, 6.262f)
            curveTo(21.84f, 17.901f, 22f, 17.344f, 22f, 16.75f)
            verticalLineTo(8.608f)
            lineToRelative(-6.7f, 3.51f)
            close()
            moveTo(7.182f, 4f)
            lineToRelative(7.007f, 7.007f)
            lineToRelative(7.795f, -4.083f)
            curveTo(21.82f, 5.282f, 20.434f, 4f, 18.75f, 4f)
            horizontalLineTo(7.182f)
            close()
        }
    }.build()
}
