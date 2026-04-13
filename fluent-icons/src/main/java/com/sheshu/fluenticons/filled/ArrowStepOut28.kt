package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepOut28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepOut28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 16.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.622f)
            lineToRelative(3.957f, 4.146f)
            curveToRelative(0.287f, 0.3f, 0.761f, 0.31f, 1.06f, 0.024f)
            curveToRelative(0.3f, -0.285f, 0.311f, -0.76f, 0.026f, -1.06f)
            lineToRelative(-5.25f, -5.5f)
            curveTo(14.4f, 2.084f, 14.205f, 2f, 14f, 2f)
            curveToRelative(-0.205f, 0f, -0.401f, 0.084f, -0.543f, 0.232f)
            lineToRelative(-5.25f, 5.5f)
            curveToRelative(-0.286f, 0.3f, -0.275f, 0.775f, 0.025f, 1.06f)
            curveToRelative(0.3f, 0.287f, 0.775f, 0.276f, 1.06f, -0.024f)
            lineToRelative(3.958f, -4.146f)
            verticalLineTo(15.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            close()
            moveToRelative(0f, 9.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
        }
    }.build()
}
