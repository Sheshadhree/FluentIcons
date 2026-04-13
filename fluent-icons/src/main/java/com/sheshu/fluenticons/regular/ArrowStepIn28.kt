package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepIn28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepIn28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(11.128f)
            lineToRelative(3.957f, -4.146f)
            curveToRelative(0.287f, -0.3f, 0.761f, -0.31f, 1.06f, -0.024f)
            curveToRelative(0.3f, 0.285f, 0.311f, 0.76f, 0.026f, 1.06f)
            lineToRelative(-5.25f, 5.5f)
            curveTo(14.4f, 16.416f, 14.205f, 16.5f, 14f, 16.5f)
            curveToRelative(-0.205f, 0f, -0.401f, -0.084f, -0.543f, -0.232f)
            lineToRelative(-5.25f, -5.5f)
            curveToRelative(-0.286f, -0.3f, -0.275f, -0.775f, 0.025f, -1.06f)
            curveToRelative(0.3f, -0.287f, 0.775f, -0.276f, 1.06f, 0.024f)
            lineToRelative(3.958f, 4.146f)
            verticalLineTo(2.75f)
            curveTo(13.25f, 2.336f, 13.586f, 2f, 14f, 2f)
            close()
            moveToRelative(4f, 20f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
            moveToRelative(-1.5f, 0f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.build()
}
