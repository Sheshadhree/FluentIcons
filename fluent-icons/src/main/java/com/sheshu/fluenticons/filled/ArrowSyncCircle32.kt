package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSyncCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSyncCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 30f)
            curveToRelative(7.732f, 0f, 14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            reflectiveCurveTo(2f, 8.268f, 2f, 16f)
            reflectiveCurveToRelative(6.268f, 14f, 14f, 14f)
            close()
            moveToRelative(8f, -19f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.584f)
            curveToRelative(-0.772f, -1.766f, -2.534f, -3f, -4.584f, -3f)
            curveToRelative(-1.48f, 0f, -2.81f, 0.642f, -3.727f, 1.667f)
            curveToRelative(-0.368f, 0.411f, -1f, 0.447f, -1.412f, 0.078f)
            curveToRelative(-0.412f, -0.368f, -0.447f, -1f, -0.078f, -1.412f)
            curveTo(12.063f, 9.903f, 13.927f, 9f, 16f, 9f)
            curveToRelative(2.546f, 0f, 4.775f, 1.36f, 6f, 3.392f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveTo(9f, 22f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1.584f)
            curveToRelative(0.772f, 1.766f, 2.534f, 3f, 4.584f, 3f)
            curveToRelative(1.48f, 0f, 2.81f, -0.642f, 3.727f, -1.667f)
            curveToRelative(0.368f, -0.411f, 1f, -0.446f, 1.412f, -0.078f)
            curveToRelative(0.412f, 0.368f, 0.447f, 1f, 0.078f, 1.412f)
            curveTo(19.937f, 22.097f, 18.073f, 23f, 16f, 23f)
            curveToRelative(-2.546f, 0f, -4.775f, -1.36f, -6f, -3.392f)
            verticalLineTo(21f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
