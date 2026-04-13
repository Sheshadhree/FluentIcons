package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailRead28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailRead28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.237f, 2.841f)
            curveToRelative(1.103f, -0.588f, 2.427f, -0.588f, 3.53f, 0f)
            lineToRelative(8.248f, 4.4f)
            curveToRelative(0.45f, 0.24f, 0.839f, 0.565f, 1.15f, 0.949f)
            lineTo(14f, 13.908f)
            lineTo(2.839f, 8.191f)
            curveToRelative(0.31f, -0.384f, 0.699f, -0.71f, 1.15f, -0.95f)
            lineToRelative(8.248f, -4.4f)
            close()
            moveTo(2.147f, 9.522f)
            curveToRelative(-0.094f, 0.33f, -0.143f, 0.675f, -0.143f, 1.028f)
            verticalLineToRelative(8.7f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineTo(22.25f)
            curveToRelative(2.07f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-8.7f)
            curveToRelative(0f, -0.353f, -0.05f, -0.7f, -0.145f, -1.03f)
            lineTo(14.34f, 15.418f)
            curveToRelative(-0.214f, 0.11f, -0.469f, 0.11f, -0.683f, 0f)
            lineTo(2.148f, 9.522f)
            close()
        }
    }.build()
}
