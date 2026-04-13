package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataArea24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataArea24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 3f)
            curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
            verticalLineToRelative(6.258f)
            lineToRelative(3.65f, -1.922f)
            curveToRelative(0.23f, -0.12f, 0.506f, -0.114f, 0.73f, 0.018f)
            lineToRelative(3.82f, 2.246f)
            lineToRelative(5.6f, -4.2f)
            curveToRelative(0.227f, -0.17f, 0.531f, -0.198f, 0.785f, -0.07f)
            curveTo(19.34f, 6.205f, 19.5f, 6.465f, 19.5f, 6.75f)
            verticalLineTo(19.5f)
            horizontalLineToRelative(0.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.664f, 21f, 20.25f, 21f)
            horizontalLineToRelative(-14f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineToRelative(-14f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            close()
            moveTo(18f, 19.5f)
            verticalLineTo(8.25f)
            lineToRelative(-4.8f, 3.6f)
            curveToRelative(-0.242f, 0.181f, -0.57f, 0.2f, -0.83f, 0.046f)
            lineTo(8.48f, 9.608f)
            lineTo(4.5f, 11.703f)
            verticalLineToRelative(6.047f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineTo(18f)
            close()
        }
    }.build()
}
