package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MegaphoneCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MegaphoneCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveTo(7f, 12.023f)
            lineToRelative(-1.171f, -0.418f)
            curveTo(5.332f, 11.426f, 5f, 10.954f, 5f, 10.427f)
            verticalLineToRelative(-0.85f)
            curveToRelative(0f, -0.529f, 0.332f, -1f, 0.829f, -1.178f)
            lineToRelative(6.501f, -2.325f)
            curveToRelative(0.814f, -0.291f, 1.671f, 0.312f, 1.671f, 1.177f)
            verticalLineToRelative(5.502f)
            curveToRelative(0f, 0.864f, -0.857f, 1.468f, -1.67f, 1.177f)
            lineToRelative(-1.379f, -0.493f)
            curveTo(10.752f, 14.33f, 9.954f, 15f, 9f, 15f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-0.977f)
            close()
            moveToRelative(2.996f, 1.072f)
            curveTo(9.948f, 13.603f, 9.52f, 14f, 9f, 14f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-0.619f)
            lineToRelative(1.996f, 0.714f)
            close()
        }
    }.build()
}
