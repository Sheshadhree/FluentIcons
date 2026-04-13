package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SearchInfo24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SearchInfo24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.102f, 16.162f)
            curveTo(13.717f, 17.31f, 11.939f, 18f, 10f, 18f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            curveToRelative(0f, 1.94f, -0.69f, 3.717f, -1.838f, 5.102f)
            lineToRelative(4.618f, 4.618f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            lineToRelative(-4.618f, -4.618f)
            close()
            moveTo(10f, 9f)
            curveTo(9.586f, 9f, 9.25f, 9.336f, 9.25f, 9.75f)
            verticalLineToRelative(3.5f)
            curveTo(9.25f, 13.664f, 9.586f, 14f, 10f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            curveTo(10.75f, 9.336f, 10.414f, 9f, 10f, 9f)
            close()
            moveToRelative(0f, -1.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
