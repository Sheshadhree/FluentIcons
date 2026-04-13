package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBidirectionalUpDown24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBidirectionalUpDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 5.628f)
            verticalLineToRelative(12.744f)
            lineToRelative(-3.456f, -3.639f)
            curveToRelative(-0.285f, -0.3f, -0.76f, -0.312f, -1.06f, -0.027f)
            curveToRelative(-0.3f, 0.286f, -0.313f, 0.76f, -0.028f, 1.06f)
            lineToRelative(4.75f, 5f)
            curveTo(11.598f, 20.917f, 11.794f, 21f, 12f, 21f)
            curveToRelative(0.206f, 0f, 0.402f, -0.084f, 0.544f, -0.233f)
            lineToRelative(4.75f, -5f)
            curveToRelative(0.285f, -0.3f, 0.273f, -0.775f, -0.027f, -1.06f)
            curveToRelative(-0.3f, -0.286f, -0.776f, -0.274f, -1.06f, 0.026f)
            lineToRelative(-3.457f, 3.639f)
            verticalLineTo(5.628f)
            lineToRelative(3.456f, 3.639f)
            curveToRelative(0.285f, 0.3f, 0.76f, 0.312f, 1.06f, 0.027f)
            curveToRelative(0.3f, -0.286f, 0.313f, -0.76f, 0.028f, -1.06f)
            lineToRelative(-4.75f, -5f)
            curveTo(12.409f, 3.09f, 12.215f, 3f, 12f, 3f)
            curveToRelative(-0.215f, 0f, -0.408f, 0.09f, -0.545f, 0.235f)
            lineTo(6.706f, 8.233f)
            curveToRelative(-0.285f, 0.3f, -0.273f, 0.775f, 0.027f, 1.06f)
            curveToRelative(0.3f, 0.286f, 0.776f, 0.274f, 1.06f, -0.026f)
            lineToRelative(3.457f, -3.639f)
            close()
        }
    }.build()
}
