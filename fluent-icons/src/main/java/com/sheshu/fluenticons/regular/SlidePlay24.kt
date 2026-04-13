package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlidePlay24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlidePlay24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineToRelative(6.748f)
            curveToRelative(-0.198f, -0.474f, -0.34f, -0.977f, -0.422f, -1.5f)
            horizontalLineTo(4.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(4.982f)
            curveToRelative(0.551f, 0.287f, 1.056f, 0.651f, 1.5f, 1.078f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(23f, 17.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
            moveToRelative(-7f, 1.999f)
            curveToRelative(0f, 0.4f, 0.445f, 0.638f, 0.777f, 0.416f)
            lineToRelative(3.002f, -1.999f)
            curveToRelative(0.297f, -0.198f, 0.297f, -0.634f, 0f, -0.832f)
            lineToRelative(-3.002f, -2f)
            curveTo(16.445f, 14.865f, 16f, 15.103f, 16f, 15.502f)
            verticalLineTo(19.5f)
            close()
        }
    }.build()
}
