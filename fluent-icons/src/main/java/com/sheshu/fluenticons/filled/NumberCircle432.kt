package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle432: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle432",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            close()
            moveToRelative(16.998f, -6.179f)
            curveToRelative(0f, -1.385f, -1.797f, -1.929f, -2.565f, -0.776f)
            lineToRelative(-5.954f, 8.934f)
            curveTo(9.903f, 18.843f, 10.522f, 20f, 11.56f, 20f)
            horizontalLineToRelative(5.437f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            verticalLineTo(9.821f)
            close()
            moveToRelative(-2f, 1.982f)
            verticalLineTo(18f)
            horizontalLineToRelative(-4.13f)
            lineToRelative(4.13f, -6.197f)
            close()
        }
    }.build()
}
