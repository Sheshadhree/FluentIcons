package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailRead24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailRead24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.19f, 2.34f)
            curveToRelative(-0.728f, -0.455f, -1.652f, -0.455f, -2.38f, 0f)
            lineTo(3.06f, 7.172f)
            curveTo(2.4f, 7.584f, 2f, 8.306f, 2f, 9.083f)
            verticalLineToRelative(7.667f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(9.082f)
            curveToRelative(0f, -0.776f, -0.4f, -1.498f, -1.06f, -1.909f)
            lineTo(13.19f, 2.34f)
            close()
            moveToRelative(-1.587f, 1.272f)
            curveToRelative(0.243f, -0.151f, 0.551f, -0.151f, 0.794f, 0f)
            lineToRelative(7.242f, 4.517f)
            lineTo(12f, 12.15f)
            lineTo(4.361f, 8.13f)
            lineToRelative(7.242f, -4.517f)
            close()
            moveTo(3.5f, 9.371f)
            lineToRelative(8.15f, 4.29f)
            curveToRelative(0.22f, 0.115f, 0.48f, 0.115f, 0.7f, 0f)
            lineToRelative(8.15f, -4.29f)
            verticalLineToRelative(7.379f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(5.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(9.37f)
            close()
        }
    }.build()
}
