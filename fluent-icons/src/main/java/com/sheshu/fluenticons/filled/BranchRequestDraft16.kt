package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BranchRequestDraft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BranchRequestDraft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3.5f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            verticalLineToRelative(4.1f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            curveTo(6f, 13.88f, 4.88f, 15f, 3.5f, 15f)
            reflectiveCurveTo(1f, 13.88f, 1f, 12.5f)
            curveToRelative(0f, -1.21f, 0.859f, -2.218f, 2f, -2.45f)
            verticalLineToRelative(-4.1f)
            curveTo(1.859f, 5.718f, 1f, 4.71f, 1f, 3.5f)
            curveTo(1f, 2.12f, 2.12f, 1f, 3.5f, 1f)
            reflectiveCurveTo(6f, 2.12f, 6f, 3.5f)
            close()
            moveTo(12.5f, 15f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(13.88f, 10f, 12.5f, 10f)
            reflectiveCurveTo(10f, 11.12f, 10f, 12.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveToRelative(1f, -8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-1f, -3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
